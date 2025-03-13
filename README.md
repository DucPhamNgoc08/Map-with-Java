# Map with Java

## Introduction
A Java application using `JXMapViewer` to display maps and waypoints.

## Features
- Display maps (OpenStreetMap, Virtual Earth...)
- Add/Remove waypoints on the map
- Show routes between waypoints

## Installation
1. **Clone the repository**:
   ```sh
   git clone https://github.com/DucPhamNgoc08/Map-with-Java.git
   ```
2. **Open the project in an IDE**
3. **Run `Map.java`** to start the application

## Usage
- Select a map type from the menu
- Click "Add Waypoint" and then click on the map to place a waypoint
- Click "Clear Waypoint" to remove all waypoints

## Project Structure
```
Map-with-Java/
│-- src/
│   ├── map/demo/Map.java                # Main application window
│   ├── Waypoint/
│   │   ├── ButtonWaypoint.java          # Custom button for waypoints
│   │   ├── EventWaypoint.java           # Interface for waypoint event handling
│   │   ├── MyWaypoint.java              # Waypoint object with event binding
│   │   ├── RoutePainter.java            # Draws routes between waypoints
│   │   ├── WaypointRender.java          # Renders waypoints on the map
│-- README.md                            # Project documentation
```

## Contribution
- Fork the repo, create a new branch, commit your changes, and submit a pull request.

## Future Updates
There will be future updates to improve and expand the project.

## Contact
For any questions or contributions, feel free to contact me via email:
📧 **Ducphamngoc39@gmail.com**




