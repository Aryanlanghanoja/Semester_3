import qrcode

# Function to generate QR code
def generate_qr(url, filename="qrcode.png"):
    qr = qrcode.QRCode(
        version=1,
        error_correction=qrcode.constants.ERROR_CORRECT_L,
        box_size=10,
        border=4,
    )
    qr.add_data(url)
    qr.make(fit=True)

    # Create an image from the QR Code instance
    img = qr.make_image(fill="black", back_color="white")
    img.save(filename)
    print(f"QR code generated and saved as {filename}")

# Example usage
url = 'https://forms.gle/Q2cJMYuP1NnEgX726'
generate_qr(url)
