import cv2
import numpy as np
from pyzbar.pyzbar import decode

cap = cv2.VideoCapture(0) 
cap.set(3, 640)
cap.set(4, 480)

while True:
    success, img = cap.read()
    isQR = False  # Initialize the flag
    cv2.imshow('Result', img)
    for barcode in decode(img):
        isQR = True  # Set the flag to True if any barcode or QR code is detected
        cv2.waitKey(1)
        if isQR :
            myData = barcode.data.decode('utf-8')
            pts = np.array([barcode.polygon], np.int32)
            pts = pts.reshape((-1, 1, 2))
            cv2.polylines(img, [pts], True, (255, 0, 255), 5)
            pts2 = barcode.rect
            cv2.putText(img, myData, (pts2[0], pts2[1]), cv2.FONT_HERSHEY_SIMPLEX, 0.9, (255, 0, 255), 2)
    
    else :
        print("No QR code or barcode detected")
        
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break
