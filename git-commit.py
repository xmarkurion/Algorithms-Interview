import os
import sys
import winsound
import time


# pyautogui.mouseInfo()
name = input("Please let me know whats you're commit name is: ")

os.system('git add .')
time.sleep(0.2)
os.system(f'git commit -m "{name}"')
time.sleep(0.2)
os.system('git push origin master')
winsound.Beep(440, 500)