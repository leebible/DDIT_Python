import cx_Oracle

con = cx_Oracle.connect('python/py@localhost:1521/xe')
cur = con.cursor()
cur.execute("select * from emp")
rows = cur.fetchall()
print(rows)

cur.close()
con.close()