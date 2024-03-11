from flask import Flask
from flask.globals import request
from flask.json import jsonify
from flask.helpers import redirect
from day13.dao_emp import DaoEmp
app = Flask(__name__) 

@app.route('/')
def main(): 
    return redirect('/static/emp.html') 

@app.route('/emplist', methods=['POST'])
def emplist():
    de = DaoEmp()
    list = de.selectList()
    return jsonify(list = list)

@app.route('/empone', methods=['POST'])
def empone():
    data = request.get_json()
    e_id=data['e_id']
    de = DaoEmp()
    vo = de.selectOne(e_id);
    return jsonify(vo = vo)

@app.route('/empadd', methods=['POST'])
def empadd():
    data = request.get_json()
    e_id=data['e_id']
    e_name=data['e_name']
    gen=data['gen']
    addr=data['addr']
    de = DaoEmp()
    cnt = de.insert(e_id, e_name, gen, addr)
    return jsonify(cnt=cnt)

@app.route('/empmod', methods=['POST'])
def empmod():
    data = request.get_json()
    e_id=data['e_id']
    e_name=data['e_name']
    gen=data['gen']
    addr=data['addr']
    de = DaoEmp()
    cnt = de.update(e_id, e_name, gen, addr)
    return jsonify(cnt=cnt)

@app.route('/empdel', methods=['POST'])
def empdel():
    data = request.get_json()
    e_id=data['e_id']
    de = DaoEmp()
    cnt = de.delete(e_id)
    return jsonify(cnt=cnt)

@app.route('/ajax', methods=['POST'])
def ajax():
    data = request.get_json()
    print(data['menu'])
    return jsonify(result = "success")





if __name__ == '__main__': 
    app.run(host="0.0.0.0",debug=True)
