public class Word{

public static int occuranceWord(int number){

int index = 0;
String word = "hello word";
char letterToCheck = 'o' ;

for(int i = 0; i < word.length(); i++){
	if(letterToCheck == word.charAt(i)){
		index++;

}
}
	return index;

}


	}

public static void main(String [] args){
String word = "hello world";

System.out.println(" occurance  " +Word.occuranceWord(word);

}