import cv2
import numpy as np
from matplotlib import pyplot as plt

vid = cv2.VideoCapture(0)

while True:
    ret, frame = vid.read()
    
    if not ret:
        print("Error: Could not read frame.")
        break

    cv2.imshow('frame', frame)
    
    img = frame
    
    img_gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)  # Convert to grayscale
    
    template = cv2.imread('download.png', cv2.IMREAD_GRAYSCALE)  # Read template in grayscale
    h, w = template.shape
    
    res = cv2.matchTemplate(img_gray, template, cv2.TM_SQDIFF)
    plt.imshow(res,cmap = 'gray')
    min_val , max_val ,min_loc , max_loc = cv2.minMaxLoc(res)
    top_left = min_loc 
    bottom_right = (top_left[0]+w,top_left[1]+h)
    cv2.rectangle(img_gray, top_left , bottom_right, 255,2)
    cv2.imshow("Matched Image", img_gray)
    cv2.waitKey()
    cv2.destroyAllWindows()    
    
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

vid.release()
cv2.destroyAllWindows()
