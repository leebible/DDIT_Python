import cx_Oracle

con    = cx_Oracle.connect('python/py@localhost:1521/xe')
cur = con.cursor()
e_id=5

sql = f"""
        delete from emp 
        where e_id='{e_id}'
    """
cur.execute(sql)
print(cur.rowcount)
con.commit()

cur.close()
con.close()
