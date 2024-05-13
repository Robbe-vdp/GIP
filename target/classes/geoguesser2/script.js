var map = L.map('map').setView([48.8584, 2.2945], 13); // Coördinaten van de Eiffeltoren

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);

var eiffelTower = L.marker([48.8584, 2.2945]).addTo(map); // Markeer de Eiffeltoren op de kaart

var popup = L.popup();

function onMapClick(e) {
    var clickedLocation = e.latlng;
    popup
        .setLatLng(clickedLocation)
        .setContent("Je hebt geklikt op: " + clickedLocation.toString())
        .openOn(map);

    var distance = calculateDistance(clickedLocation.lat, clickedLocation.lng, 48.8584, 2.2945); // Bereken de afstand
    alert("Afstand tot de Eiffeltoren: " + distance.toFixed(2) + " km");
}

map.on('click', onMapClick);

// Haversine-formule voor afstandsberekening tussen twee punten op aarde
function calculateDistance(lat1, lon1, lat2, lon2) {
    var R = 6371; // Straal van de aarde in kilometers
    var dLat = (lat2 - lat1) * Math.PI / 180;
    var dLon = (lon2 - lon1) * Math.PI / 180;
    var a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
            Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180) *
            Math.sin(dLon / 2) * Math.sin(dLon / 2);
    var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    var d = R * c;
    return d;
}
