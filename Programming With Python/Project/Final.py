import cv2
import vlc
import numpy as np
from pyzbar.pyzbar import decode

instance = vlc.Instance()
player = instance.media_player_new()
media = instance.media_new('Buzzer.mpeg') 

cap = cv2.VideoCapture(0)
cap.set(3, 640)
cap.set(4, 480)
present_Student = []

with open('myDataFile.txt') as f:
    myDataList = f.read().splitlines()

while True:

    success, img = cap.read()
    for barcode in decode(img):
        myData = barcode.data.decode('utf-8')
        print(myData)

        if myData in myDataList:
            myColor = (0, 255, 0)
            if(myData == '118299~') :
                myData = '92200133011'
            elif(myData == '119402~') :
                myData = '92200133022'
            elif(myData == '119486~') :
                myData = '92200133026'
            elif(myData == '119437~') :
                myData = '92200133023'
            elif(myData == '119774~') :
                myData = '92200133040' 
            elif(myData == '121182~') :
                myData = '92310133007'
            elif(myData == '119563~') :
                myData = '92200133031'
            elif(myData == '119238~') :
                myData = '92200133017'
            elif(myData == '117143~') :
                myData = '92200938063'
            present_Student.append(myData)
        else:
            cv2.waitKey(5)
            myColor = (0, 0, 255)
            player.set_media(media)
            player.play()
            break

        pts = np.array([barcode.polygon], np.int32)
        pts = pts.reshape((-1, 1, 2))
        cv2.polylines(img, [pts], True, myColor, 5)
        pts2 = barcode.rect
        cv2.putText(img, myData[len(myData)-2:], (pts2[0], pts2[1]), cv2.FONT_HERSHEY_SIMPLEX, 0.9, myColor, 2)
    
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

    cv2.imshow('Result', img)
    cv2.waitKey(1)

cap.release()
cv2.destroyAllWindows()

print("Present Student")
finalList = list(set(present_Student))
print(finalList)
print(f"Total Presented Student :- {len(finalList)}")
f.close()