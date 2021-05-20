package com.lxisoft.cast;

public class Cast 
{
	
	Kunjacko kunjacko=new Kunjacko();
	
	Shalini shalini=new Shalini();
	
	Zainuddin zainuddin=new Zainuddin();
	
	public void castsOfNiram()
	{
		
		if ( (kunjacko instanceof Actor) && (shalini instanceof Actress) && (zainuddin instanceof Comedian) )
		{
			System.out.println("----------------------------------------------");
			System.out.println("Hero of the movie is Kunjacko Boban!!!");
			System.out.println("----------------------------------------------");
		
		                          try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
			System.out.println("----------------------------------------------");
			System.out.println("Heroine of the movie is Shalini!!!");
			System.out.println("----------------------------------------------");
		                         
								 try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }
										
			System.out.println("----------------------------------------------");
			System.out.println("Comedian in the movie is Zainuddin!!!");
			System.out.println("----------------------------------------------");
                                    try{
			                             Thread.sleep(2000);
		                                }
		                          catch(InterruptedException e)
		                                {
			                            Thread.currentThread().interrupt();
		                                }		
		}
	}

}