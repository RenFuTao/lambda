package lambda;

import java.util.function.Consumer;



public class test {

	public static void Consumerapple(apple[] apps,Consumer<apple> consumer){

		 for(apple app:apps){

			 consumer.accept(app);

		 }

	 }

	public static void main(String[] args) {

		//使用lambda表达式

		apple []apples = {new apple("red",0.3),new apple("green",0.2)};

		Consumerapple(apples, (apple)->System.out.println(apple));

		//使用内部类

		Consumerapple(apples, new Consumer<apple>() {

			public void accept(apple apple) {

				System.out.println(apple);

			}

		});

		

	}

	

}