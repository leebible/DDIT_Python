import sqlite3

con = sqlite3.connect("sample.db")

cur = con.cursor()

cur.execute("select * from sample")

rows = cur.fetchall()
print(rows)

con.close()