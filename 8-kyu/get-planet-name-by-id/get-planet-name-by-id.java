class Planet {
  static String getPlanetName(int id) {
    String name = null;
    switch (id) {
      case 1:
        name = "Mercury";
        break;
      case 2:
        name = "Venus";
        break;
      case 3:
          name = "Earth";
        break;
      case 4:
          name = "Mars";
        break;
      case 5:
          name = "Jupiter";
        break;
      case 6:
          name = "Saturn";
        break;
      case 7:
          name = "Uranus";
        break;
      case 8:
          name = "Neptune";
        break;
    }
    return name;
  }
}