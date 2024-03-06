import sqlite3

con = sqlite3.connect("sample.db")

cur = con.cursor()
sql = "update sample set col02=5, col03=5 where col01=3"
cur.execute(sql)
con.commit()
print(cur.rowcount)

cur.close()
con.close()