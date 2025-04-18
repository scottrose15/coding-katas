/**
 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
 * 
 * Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:
 * 
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this
 */

class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        String likeText;
        if (names.length < 0) {
          return "Error";
        }
        switch (names.length){
            case 0:
              likeText = "no one likes this";
              break;
            case 1:
              likeText = "%s likes this";
              likeText = String.format(likeText, names[0]);
              break;
            case 2:
              likeText = "%s and %s like this";
              likeText = String.format(likeText, names[0], names[1]);
              break;
            case 3:
              likeText = "%s, %s and %s like this";
              likeText = String.format(likeText,names[0], names[1], names[2]); 
              break;
            default:
              likeText = "%s, %s and %d others like this";
              likeText = String.format(likeText, names[0], names[1], names.length - 2);
              break;
        }
        return likeText;
    }
}