import cx_Oracle
class DaoMem :
    def __init__(self):
        self.con = cx_Oracle.connect('python/py@localhost:1521/xe')
        self.cur = self.con.cursor()
       
      
     
    def insert(self,m_id,m_name,tel,email):
        sql=f"""
            insert into mem values('{m_id}','{m_name}','{tel}','{email}')
            """
        self.cur.execute(sql)
        self.con.commit()
        cnt=self.cur.rowcunt
        return cnt
    
    def selectList(self):
        sql=f"""
            select m_id, m_name, tel, email
            from mem
        """
        self.cur.execute(sql)
        rows = self.cur.fetchall()
        list = []
        for i in rows :
            list.append({'m_id':i[0],'m_name':i[1],'tel':i[2],'email':i[3]})
        return list
if __name__ == '__main__':
    de = DaoMem()
