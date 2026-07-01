package com.safvan.service.mvc.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.safvan.beans.Ticket;
import com.safvan.beans.Train;
import com.safvan.beans.User;
import com.safvan.beans.UserProfile;
import com.safvan.constants.TicketStatus;
import com.safvan.constants.UserRole;
import com.safvan.exception.mvc.booking.BookingFailedException;
import com.safvan.exception.mvc.booking.NoEnoughSeatsForBooking;
import com.safvan.repository.mvc.ITicketRepository;
import com.safvan.repository.mvc.ITrainRepository;
import com.safvan.service.mvc.ITrainService;

@ExtendWith(MockitoExtension.class)
public class BookingServiceImplTest {

	@InjectMocks
	private BookingServiceImpl bookingService;

	@Mock
	private ITrainService trainService;

	@Mock
	private ITrainRepository trainRepository;

	@Mock
	private ITicketRepository ticketRepository;

	// ... rest of the test methods stay exactly the same
}