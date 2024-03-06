import sqlite3

con = sqlite3.connect("sample.db")

cur = con.cursor()
sql = "delete from sample where col01=4"
cur.execute(sql)
con.commit()
print(cur.rowcount)

cur.close()
con.close()