import com.sun.source.doctree.SeeTree;

import java.util.*;

public class EnoughIsEnough {
	public static void main(String[] args) {
		int[] elements = {1,2,3,1,2,1,2,3};
		deleteNth(elements,2);
	}

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		List<Integer> newList = new ArrayList<>();
		Map<Integer,Integer> newMap = new LinkedHashMap<>();
		Map<Integer,Integer> countMap = new LinkedHashMap<>();
		Set<Integer> newSet = new LinkedHashSet<>();
		for(int i =0; i<elements.length;i++){
			newMap.put(elements[i],0);
			newSet.add(elements[i]);
			countMap.put(elements[i],1);
		}

		List<Integer> finalList = new ArrayList<>(newSet);
		for(int i =0; i<elements.length; i++){
			if(newMap.containsKey(elements[i]) && newMap.get(elements[i]) < maxOccurrences){
				newMap.put(elements[i],newMap.get(elements[i])+1);
			}
		}



			for(int j =0; j< elements.length;j++){
				if(newMap.containsKey(elements[j]) && countMap.get(elements[j]) <= newMap.get(elements[j])){
					newList.add(elements[j]);
					System.out.println(newList);
					countMap.put(elements[j],countMap.get(elements[j])+1 );
				}

		}


		int[] finalArray = new int[newList.size()];
		for(int i =0; i<finalArray.length; i++){
			finalArray[i] = newList.get(i);
		}

		return finalArray;
	}

}