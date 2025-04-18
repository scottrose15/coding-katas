/**
* In a small town the population is p0 = 1000 at the beginning of a year. 
* The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town. 
* How many years does the town need to see its population greater than or equal to p = 1200 inhabitants?
*/

class PopulationGrowth {
    
    public static int nbYear(int startingPopulation, double percent, int growthConstant, int populationGoal) {
      int currentYear = 0;
      return nbYear(startingPopulation, percent, growthConstant, populationGoal, currentYear);
    }

    public static int nbYear(int startingPopulation, double percent, int growthConstant, int populationGoal, int currentYear) {
      if (startingPopulation >= populationGoal){
        return currentYear;
      }
      int nextYearPopulation = startingPopulation + ((int) (startingPopulation * (percent * 0.01))) + growthConstant;
      return nbYear(nextYearPopulation, percent, growthConstant,populationGoal, currentYear + 1);
        
    }
}