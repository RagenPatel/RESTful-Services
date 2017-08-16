import schedule
import time
import os
import psutil

def job():
    if not psutil.cpu_percent()>10 and not psutil.virtual_memory()[2]>60:
        print("I'm working...")
        os.system("javac main.java")
        os.system("java main")
        print("I'm finished working")
    else:
        print "memory usage:", psutil.virtual_memory()[2], "%"
        print "cpu usage:", psutil.cpu_percent(), "%"
        print "*JOB EXECUTION SKIPPED*\n-----------------------\n Reduce memory/CPU usage to continue execution\n-----------------------"

schedule.every(1).seconds.do(job)
#schedule.every(10).minutes.do(job)
#schedule.every().hour.do(job)
#schedule.every().day.at("10:30").do(job)

while 1:
    schedule.run_pending()
    time.sleep(1)
