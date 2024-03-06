import sqlite3

con = sqlite3.connect("sample.db")

cur = con.cursor()
sql = "insert into sample values(4,4,4)"
cur.execute(sql)
con.commit()
print(cur.rowcount)

cur.close()
con.close()