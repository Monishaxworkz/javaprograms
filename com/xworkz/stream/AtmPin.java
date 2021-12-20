package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPin {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1234,2345,3456,4567,9876,8765,7654,6543,5432,4321,2341,5463,8679,4352,3214,6789,5498);
		List<Integer> list = stream.filter((pin)->pin>3000).collect(Collectors.toList());
		list.forEach((pin)->System.out.println(pin));
	}

}
