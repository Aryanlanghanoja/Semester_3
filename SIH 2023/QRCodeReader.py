import cv2
from pyzbar.pyzbar import decode
import time

img = cv2.imread('DemoQR.png')
for i in decode(img) :
    print(i.data.decode('utf-8'))
    break
        