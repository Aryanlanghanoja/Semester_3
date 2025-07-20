"""
from geopy.geocoders import ArcGIS

# Create an ArcGIS geocoder object
geolocator = ArcGIS()

# Geocode a location (e.g., 'Saurastra University')
location = geolocator.geocode('Saurastra University')

# Check if location was found and print latitude and longitude
if location:
    print(f"Latitude: {location.latitude}, Longitude: {location.longitude}")
else:
    print("Location not found.")
"""

from geopy.geocoders import Nominatim

# Create a Nominatim geocoder object
geolocator = Nominatim(user_agent="geoapiExercises")

# Geocode a location (e.g., 'Saurastra University')
location = geolocator.geocode("Henderson")

# Check if location was found and print latitude and longitude
if location:
    print(f"Latitude: {location.latitude}, Longitude: {location.longitude}")
else:
    print("Location not found.")
