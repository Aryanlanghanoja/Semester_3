import requests

# Replace 'YOUR_API_KEY' with your actual MapmyIndia API key
api_key = '4fb7754d5cc5f0aba706e579cefe9c79'

# Function to get geocodes for an address


def get_geocodes(address):
    url = f"https://atlas.mapmyindia.com/api/places/geocode?address={address}"
    headers = {
        "Authorization": f"Bearer {api_key}"
    }

    try:
        response = requests.get(url, headers=headers)
        data = response.json()

        if data.get("info", {}).get("statuscode") == 200:
            location = data["copResults"]["locations"][0]
            latitude = location["lat"]
            longitude = location["lng"]
            return latitude, longitude
        else:
            print("Geocoding failed. Error message:", data.get(
                "info", {}).get("message", "Unknown error"))
            return None
    except Exception as e:
        print("An error occurred:", str(e))
        return None


# Example usage
address = "Poonam bakery, Nikol Gam Road, Nikol, Ahmedabad, Gujarat"
geocodes = get_geocodes(address)

if geocodes:
    latitude, longitude = geocodes
    print(f"Latitude: {latitude}, Longitude: {longitude}")
