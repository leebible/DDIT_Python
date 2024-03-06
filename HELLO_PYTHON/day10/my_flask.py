from flask import Flask
from flask.globals import request
from flask.templating import render_template
from day10.dao_mem import DaoMem
app = Flask(__name__) 

@app.route('/')
@app.route('/mem_list')
def mem_list():
    de = DaoMem()
    list = de.selectList()
    return render_template("mem_list.html", list=list)

@app.route('/mem_add_act', methods=['POST'])
def mem_add_act():
    m_id=request.form['m_id']
    m_name=request.form['m_name']
    tel=request.form['tel']
    email=request.form['email']
    
    de = DaoMem()
    cnt=de.insert(m_id, m_name, tel, email)
    return render_template("mem_add_act.html",cnt=cnt)

@app.route('/mem_add')
def mem_add():
    return render_template("mem_add.html")


if __name__ == '__main__': 
    app.run(host="0.0.0.0",debug=True)
