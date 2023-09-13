package com.epam.mjc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceCreator {
	
	

    public Operation<Integer> divideBy(Integer divider) {
    	List<Integer> list = new ArrayList<Integer>();
    	Operation op = x -> {
    		for (Iterator<Integer> iterator = x.iterator(); iterator.hasNext();) {
				Integer elementOfListx = iterator.next();
				list.add(elementOfListx/divider);
    		}
			return list;


    	};
		return op;
    
    	    }
}
