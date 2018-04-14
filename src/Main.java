import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Розклад занять 141 групи.");
	System.out.println("Введіть номер підгрупи (1/2) : ");
	int group = sc.nextInt();
	if(group == 1 || group == 2) {
		System.out.println("Введіть номер тижня (1/2) : ");
		int week = sc.nextInt();
		if(week == 1 || week == 2) {
			System.out.println("Введіть день тижня: ");
			String day = sc.next();
			if(day.equalsIgnoreCase("Понеділок")){
				System.out.println("1. Вища математика, 9-3, Дрінь Я.М.");
				System.out.println("2. Алгоритмізація та програмування, 8-117, Фратавчан В.Г.");
				if(group == 1) 
					if(week == 1){
						System.out.println("3. Алгоритмізація та програмування, 8-213, Фратавчан В.Г.");
				//if(group == 1 && week == 1) {System.out.println("3. Алгоритмізація та програмування, 8-213, Фратавчан В.Г.");}
				}
				if(group == 2)
					if(week == 2) {
						System.out.println("3. Алгоритмізація та програмування, 8-213, Фратавчан В.Г.");
				//if(group == 2 && week == 2) {System.out.println("3. Алгоритмізація та програмування, 8-213, Фратавчан В.Г.");}		
					}
				System.out.println("4. Фізичне виховання (за вибором)");
			}
			if(day.equalsIgnoreCase("Вівторок")) {
				System.out.println("1. Охорона праці та безпека життєдіяльності (за вибором)");
				if(week == 1) {
					System.out.println("3. Дискретна математика, 8-212, Стецько Ю.П.");
				}
				if(week == 2) {
					System.out.println("3. Комп'ютерна графіка, 8-212, Фратавчан В.Г.");
				}
				if(group == 1)
					if(week == 1) {
						System.out.println("4. Комп'ютерна графіка, 8-213, Фратавчан В.Г.");
					}
				//if(group == 1 && week == 1){System.out.println("4. Комп'ютерна графіка, 8-213, Фратавчан В.Г.");}		
				if(group == 2)
					if(week == 1) {
						System.out.println("4. Дискретна математика, 8-212, Стецько Ю.П.");
					}
				//if(group == 2 && week == 1) {System.out.println("4. Дискретна математика, 8-212, Стецько Ю.П.");}
				if(group == 1)
					if(week == 2) {
						System.out.println("4. Дискретна математика, 8-212, Філіпчук О.І.");
					}
				//if(group == 1 && week == 2) {System.out.println("4. Дискретна математика, 8-212, Філіпчук О.І.");}
				if(group == 2)
					if(week == 2) {
						System.out.println("4. Комп'ютерна графіка, 8-213, Фратавчан В.Г.");
					}
				//if(group == 2 && week == 2) {System.out.println("4. Комп'ютерна графіка, 8-213, Фратавчан В.Г.");}
			}
			if(day.equalsIgnoreCase("Середа")) {
				System.out.println("1. Веб-технології та веб-дизайн, 8-221, Лазорик В.В.");
				if(group == 1) {
					System.out.println("2. Вища математика, 8-212, Кириченко О.Л.");
				}
				if(group == 2) {
					System.out.println("2. Вища математика, 8-211, Філіпчук О.І.");
				}
				System.out.println("3. Вища математика, 9-3, Дрінь Я.М.");
				if(group == 2)
					if(week == 1) {
						System.out.println("4. Комп'ютерна графіка, 8-213, Фратавчан В.Г.");
					}
				//if(group == 2 && week == 1) {System.out.println("4. Комп'ютерна графіка, 8-213, Фратавчан В.Г.");}
				if(group == 1)
					if(week == 2) {
						System.out.println("4. Комп'ютерна графіка, 8-213, Фратавчан В.Г.");
					}
				//if(group == 1 && week == 2) {System.out.println("4. Комп'ютерна графіка, 8-213, Фратавчан В.Г.");}
			}
			if(day.equalsIgnoreCase("Четвер")) {
				System.out.println("1. Іноземна мова, 8-202, Черепня Ю.В.");
				if(group == 1)
					if(week == 1) {
						System.out.println("2. Теорія алгоритмів, 8-213, Сопронюк Є.Ф.");
					}
				//if(group == 1 && week == 1) {System.out.println("2. Теорія алгоритмів, 8-213, Сопронюк Є.Ф.");}
				if(group == 2)
					if(week == 1) {
						System.out.println("2. Веб-технології та веб-дизайн, 8-216, Кириченко О.Л.");
					}
				//if(group == 2 && week == 1) {System.out.println("2. Веб-технології та веб-дизайн, 8-216, Кириченко О.Л.");}
				if(group == 1)
					if(week == 2) {
						System.out.println("2. Веб-технології та веб-дизайн, 8-216, Кириченко О.Л.");
					}
				//if(group == 1 && week == 2) {System.out.println("2. Веб-технології та веб-дизайн, 8-216, Кириченко О.Л.");}
				if(group == 2)
					if(week == 2) {
						System.out.println("2. Теорія алгоритмів, 8-213, Сопронюк Є.Ф.");
					}
				//if(group == 1 && week == 1) {System.out.println("2. Теорія алгоритмів, 8-213, Сопронюк Є.Ф.");}
				if(group == 1)
					if(week == 1) {
						System.out.println("3. Веб-технології та веб-дизайн, 8-216, Кириченко О.Л.");
					}
				//if(group == 1 && week == 1) {System.out.println("3. Веб-технології та веб-дизайн, 8-216, Кириченко О.Л.");}
				if(group == 2)
					if(week == 2) {
						System.out.println("3. Веб-технології та веб-дизайн, 8-216, Кириченко О.Л.");
					}
				//if(group == 2 && week == 2) {System.out.println("3. Веб-технології та веб-дизайн, 8-216, Кириченко О.Л.");}
				System.out.println("4. Іноземна мова (СПЕЦГРУПА), 8-202, Венкель О.В.");
			}
			if(day.equalsIgnoreCase("П'ятниця") || day.equalsIgnoreCase("Пятниця")) {
				System.out.println("1. Теорія алгоритмів, 8-106, Сопронюк Є.Ф.");
				if(group == 1) {
					System.out.println("2. Вища математика, 8-212, Кириченко О.Л.");
				}
				if(group == 2) {
					System.out.println("2. Вища математика, 8-211, Філіпчук О.І.");
				}
			}
				else if(day.equalsIgnoreCase("Субота") && day.equalsIgnoreCase("Неділя")) {
					System.out.println("Вихідний день.");
			}
				else {
					System.out.println("День введений неправильно.");
				}
		} else {
			System.out.println("Даного номеру тижня не існує.");
		}
		
	} else {
		System.out.println("Даної підгрупи не існує.");
	}
	sc.close();
	}

}