# waybar-weather-request
Java program that  makes a request to the Open-Meteo API and converts it into a JSON output. This output provides details on the daily average temperature and precipitation probability, designed for use with the waybar.

## Prerequisites
Make sure the following prerequisites are installed on your system:

- **Java 17+**: The program is written in Java and requires a Java Runtime Environment (JRE) to run. The JDK is needed if you plan to compile the source of the code.
- **Wayland and Waybar**: This program's out put is formatted specifically for use with the Waybar. Waybar is designed for Wayland compositors, such as Hyprland, which are available on Linux-based operating systems.
- **Nerd Fonts (Optional)**: Required only if you want to display the custom icons, such as the thermometer icon, correctly.


## How to implement

### 1. Customizing the Location

By default, the program uses the coordinates for Brasília, the capital of Brazil. To change this, edit the 'latitude' and 'longitude' variables in the 'getData()' method located in the 'weather/src/Service/Request.java' class.

### 2. Creating and Running the Location

First, create a '.jar' file form project. Then, you can run the program using a simple shell script:
```
#!/bin/bash
java -jar ~/.config/waybar/apps/weather.jar
```

### 3. Waybar Configuration

To implement the script in the Waybar config file, add the following module. Be sure to replace <path-to-your-script> with the actual path to the script you created:
```
"custom/weather":{
"format": "  {}",
"exec": "<Path to your script>",
"return-type": "json"
}
```
Finally, don't forget to add this custom/weather module to one of the Waybar module lists in your config file and update your style.css to match your desired aesthetic.
