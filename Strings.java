package JavaOOP2;

public class Strings {
    public static void main(String[] args){
    
        String message = "Today is a good day to be alive";
	    System.out.println("Message contains "+message.length() + " characters");
	    System.out.println("First character of message: " + message.charAt(0));
	    System.out.println("Unicode of first character is: " + message.codePointAt(0));
	    System.out.println("Unicode of previous character is: " + message.codePointBefore(1));
	    System.out.println("Message contains " + message.codePointCount(0, 31) + " Unicode points");
	    System.out.println("Compares two strings: " + message.compareTo(message));
	    System.out.println("Compares two strings ignore the case: " + message.compareToIgnoreCase(message));
	    System.out.println("Append a string to the end of the string: " + message.concat(".Isn't it?"));
	    System.out.println("Returns true if string contains sequence of characters: " + message.contains("good"));
	    System.out.println("Finds out if a string contains a sequence of characters: " + message.contentEquals("a"));
	    System.out.println("Returns true if the string contains the exact same characters as the string buffer: " + message.contentEquals(message));
	    System.out.println("Returns true if the specified string ends with the defined suffix: " + message.endsWith(" alive"));
	    System.out.println("Returns true if the specified object contains same elements: " + message.equals(message));
	    System.out.println("Returns true if the compared objects are the same without case sensitive: " + message.equalsIgnoreCase(message));
	    System.out.println("Returns formatted string: " + message.formatted(args));
	    System.out.println("Returns the has code for string: " + message.hashCode());
	    System.out.println("Adjust indentation: " + message.indent(5));
	    System.out.println("Returns the index of specified character is case sensitive: " + message.indexOf("T"));
	    System.out.println("Returns the index of specified substring: " + message.indexOf("is"));
	    System.out.println("Returns the index of character can adjust which index to search: " + message.indexOf("day", 3));
	    System.out.println("Returns the index of substring at the specified index: " + message.indexOf("is", 0));
	    System.out.println("Returns canocical representation of string: " + message.intern());
	    System.out.println("Returns true is string contains only white spaces or empty: " + message.isBlank());
	    System.out.println("Returns true is lenght is 0: " + message.isEmpty());
	    System.out.println("Returns the index of last occurence of specified character: " + message.lastIndexOf(0));
	    System.out.println("Returns the index of last occurence of specified substring: " + message.lastIndexOf("is"));
	    System.out.println("Returns the index of last occurrence of specified character counting backwards: " + message.lastIndexOf("is", 25));
	    System.out.println("Returns the index of last occurence of specified substring counting backwards: " + message.lastIndexOf("is", 25));
	    System.out.println("Returns the lenght of the string: " + message.length());
	    System.out.println("Returns true if string matches given regular expression: " + message.matches(message));
	    
}
}
