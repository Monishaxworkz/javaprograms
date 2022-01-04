package com.xworkz.jdbc1.train;

import java.util.Collection;

public class TrainTester {

	public static void main(String[] args) {
		TrainDTO dto = new TrainDTO(5,563745,"vijayawada","hubli",78,500,"normal","amaravathi");
		TrainDAO dao = new TrainDAO();
		boolean saved = dao.save(dto);
		
	System.out.println(	dao.deleteByTrainNo(756848));
	System.out.println(	dao.deleteByTrainNoAndTid(756848,3));
		TrainDTO trainDTO = dao.getByTrainNo(756848);
		System.out.println(trainDTO);
		Collection<TrainDTO> trains= dao.getAll(null);
		trains.forEach((m)->System.out.println(m));
		Collection<TrainDTO> trains2= dao.getAllByBording();
		trains.forEach((m)->System.out.println(m));
		Collection<TrainDTO> trains1= dao.AllByDestination();
		trains.forEach((m)->System.out.println(m));
		System.out.println(dao.updateDestinationAndBoardingByNo(563745,"vijaywada","hubli"));
		System.out.println(dao.updateDestinationByTrainNo("hubli",563745));
		System.out.println(dao.getTotal());
		System.out.println(dao.getMaxPrice());
		System.out.println(dao.getMinPrice());
	}
	
}
