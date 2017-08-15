import schedule
import time
import os

def job():
    print("I'm working...")
    os.system("javac main.java")
    os.system("java main")
    print("I'm finished working")

schedule.every(1).seconds.do(job)
#schedule.every(10).minutes.do(job)
#schedule.every().hour.do(job)
#schedule.every().day.at("10:30").do(job)

while 1:
    schedule.run_pending()
    time.sleep(1)
