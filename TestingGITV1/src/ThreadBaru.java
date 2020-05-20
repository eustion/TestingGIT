class ThreadBaru implements Runnable {
	public ThreadBaru() {
		Thread newThread = new Thread(this);
		newThread.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Dalam child thread (" + i + ")");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}