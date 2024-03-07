from flask import Flask
from flask.globals import request
from flask.templating import render_template
from day08.dao_emp import DaoEmp
app = Flask(__name__) 

@app.route('/')
def main(): 
    return 'Hello Flask!'    

if __name__ == '__main__': 
    app.run(host="0.0.0.0",debug=True)
