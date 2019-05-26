package lambda;

import java.util.function.Consumer;



public class test {

	public static void Consumerapple(apple[] apps,Consumer<apple> consumer){

		 for(apple app:apps){

			 consumer.accept(app);

		 }

	 }

	public static void main(String[] args) {

		//ʹ��lambda���ʽ

		apple []apples = {new apple("red",0.3),new apple("green",0.2)};

		Consumerapple(apples, (apple)->System.out.println(apple));

		//ʹ���ڲ���

		Consumerapple(apples, new Consumer<apple>() {

			public void accept(apple apple) {

				System.out.println(apple);

			}

		});

		

	}

	

}