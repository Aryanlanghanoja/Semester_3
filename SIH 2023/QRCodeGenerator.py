import qrcode

data = 'https://github.com/0211Abhay/CPMAD_PROJECT.git'
img = qrcode.make(data)
img.save('DemoQR.png')