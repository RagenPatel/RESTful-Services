# RESTful-Services

# Usage
 
### Pre-reqs:

1. Have `python` and `java` installed

2. Install `Scheduler` and `Flask` using `pip`. Install get-pip if you're using python version >3.4.

### Instructions:

1. Set up local server using Flask. Run command `python server.py` to get your local server running. Your local server will likely be accessible from `http://127.0.0.1:5000/`

2. Confirm server is running by going to website: `http://127.0.0.1:5000/`. You should see `Hello World`

3. Run command `python run10mins.py` to have the script run. The script compiles and runs  `main.java` which attempts a `RESTful GET request` to URL:`http://127.0.0.1:5000/` and then saves the contents to `output.txt` file. This script will run this `main.java` file every second, and you can see it continuously update the `output.txt` file
