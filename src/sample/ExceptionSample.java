package sample;

import java.io.IOException;
import java.net.SocketException;

public class ExceptionSample {

	public static void main(String[] args) {

		try {
			//throw new SocketTimeoutException();
			throw new SocketException();
			/*
		} catch (SocketTimeoutException e) {
			System.out.println("catch句:SocketTimeoutException");
			System.out.println(e.getClass().getName().toString());
			*/
		} catch (SocketException e) {
			System.out.println("catch句:SocketException");
			System.out.println(e.getClass().getName().toString());
		} catch (IOException e) {
			System.out.println("catch句:IOException");
			System.out.println(e.getClass().getName().toString());
		} catch (Exception e) {
			System.out.println("catch句:Exception");
			System.out.println(e.getClass().getName().toString());
		} finally {
			System.out.println("finally句");
		}

	}

}
