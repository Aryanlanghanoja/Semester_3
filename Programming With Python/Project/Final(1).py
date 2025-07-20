import cv2
import numpy as np
from pyzbar.pyzbar import decode

# Initialize the video capture object
cap = cv2.VideoCapture(0)
cap.set(3, 640)
cap.set(4, 480)
present_Student = []

# Read the student data from a file
with open('myDataFile.txt') as f:
    myDataList = f.read().splitlines()

while True:
    success, img = cap.read()
    for barcode in decode(img):
        myData = barcode.data.decode('utf-8')
        print(myData)

        if myData in myDataList:
            myColor = (0, 255, 0)
            if myData == '118299~':
                myData = '92200133011'
            elif myData == '119402~':
                myData = '92200133022'
            elif myData == '119486~':
                myData = '92200133026'
            elif myData == '119437~':
                myData = '92200133023'
            elif myData == '119774~':
                myData = '92200133040'
            elif myData == '121182~':
                myData = '92310133007'
            present_Student.append(myData)
        else:
            cv2.waitKey(5)
            myColor = (0, 0, 255)

        pts = np.array([barcode.polygon], np.int32)
        pts = pts.reshape((-1, 1, 2))
        cv2.polylines(img, [pts], True, myColor, 5)
        pts2 = barcode.rect
        cv2.putText(img, myData, (pts2[0], pts2[1]), cv2.FONT_HERSHEY_SIMPLEX, 0.9, myColor, 2)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

    cv2.imshow('Result', img)
    cv2.waitKey(1)

cap.release()
cv2.destroyAllWindows()

# Read the data from the file again
with open('myDataFile.txt', 'r') as g:
    data = g.read()

print("Present Student")

print(present_Student)
