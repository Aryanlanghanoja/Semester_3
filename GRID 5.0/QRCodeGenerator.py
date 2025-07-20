import qrcode

for i in range(1, 11):
    data = str(i)
    img = qrcode.make(data)
    img.save(data + ".png")
