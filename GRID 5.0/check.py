from pyzbar.pyzbar import decode
from PIL import Image

def has_qr_code(image_path):
    # Open the image using Pillow (PIL)
    img = Image.open(image_path)

    # Decode QR codes using pyzbar
    decoded_objects = decode(img)

    # Check if any QR code was detected
    if decoded_objects:
        return True
    else:
        return False

# Test the function
image_path_with_qr = '1.jpg'
image_path_without_qr = '2.jpg'

result_with_qr = has_qr_code(image_path_with_qr)
result_without_qr = has_qr_code(image_path_without_qr)

print(f"Image with QR code: {result_with_qr}")  # Should print True
print(f"Image without QR code: {result_without_qr}")  # Should print False
