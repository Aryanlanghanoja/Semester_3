import cv2
import numpy as np
from matplotlib import pyplot as plt

# Load the image
img = cv2.imread('7.jpeg')

# Convert the image to grayscale
img_gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

# Load the template in grayscale
template = cv2.imread('download.png', cv2.IMREAD_GRAYSCALE)
h, w = template.shape

# Match the template using template matching method
res = cv2.matchTemplate(img_gray, template, cv2.TM_SQDIFF)
min_val, max_val, min_loc, max_loc = cv2.minMaxLoc(res)

# Get the top-left corner of the matched region
top_left = min_loc
bottom_right = (top_left[0] + w, top_left[1] + h)

# Draw a rectangle around the matched region on the original image
matched_img = img.copy()  # Create a copy of the original image to draw on
cv2.rectangle(matched_img, top_left, bottom_right, (0, 255, 0), 2)  # Draw a green rectangle

# Display the matched image using matplotlib
plt.imshow(cv2.cvtColor(matched_img, cv2.COLOR_BGR2RGB))
plt.title('Matched Image')
plt.show()

# Wait for a key press and close all windows
cv2.waitKey(0)
cv2.destroyAllWindows()
