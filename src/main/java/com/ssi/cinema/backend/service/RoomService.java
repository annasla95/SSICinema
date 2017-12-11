package com.ssi.cinema.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssi.cinema.backend.RoomRepository;
import com.ssi.cinema.backend.data.entity.Room;

@Service
public class RoomService extends CrudService<Room> {
	
	private final PasswordEncoder passwordEncoder;
	
	private final RoomRepository roomRepository;
	
	@Autowired
	public RoomService(RoomRepository roomRepository, PasswordEncoder passwordEncoder) {
		this.roomRepository = roomRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
	public Room findByName(String name) {
		return getRepository().findByName(name);
	}
	
	@Override
	protected RoomRepository getRepository() {
		return roomRepository;
	}
	
	public String encodePassword(String value) {
		return passwordEncoder.encode(value);
	}
	
	@Override
	@Transactional
	public Room save(Room entity) {
		return super.save(entity);
	}
	
	@Override
	@Transactional
	public void delete(long roomId) {
		super.delete(roomId);
	}
	
	@Override
	public long countAnyMatching(Optional<String> filter) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Page<Room> findAnyMatching(Optional<String> filter, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
