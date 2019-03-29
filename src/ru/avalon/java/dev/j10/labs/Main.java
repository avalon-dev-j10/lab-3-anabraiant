package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        
        FibonacciInitializer  fibonacciInit  = new FibonacciInitializer();
        
        fibonacciInit.initialize(array); // init with Fibonacci sequence
       
       
        //sout так посмотреть какие числа сформировались и из чего получится сумма
        System.out.print ("Fobonacci sequence: ");
        for (int a : array) {
        System.out.print(a + " ");}
        System.out.println();
        
        // find suum of Fibonacci sequence
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum +=array[i];
        }
        System.out.println("Sum of array elements = " +sum);
        
        
        // init array with random numbers 
        RandomInitializer randomInit = new RandomInitializer(-50, 51);
        randomInit.initialize(array);
        
        // look what we got with RandomInit
        System.out.println("Random didgits array: ");
        for ( int b : array)
            System.out.print (b + " ");
        System.out.println();
        
       //init array  with Bubblesort
       
        int[] arrayForBubble = new int[20];
	randomInit.initialize(arrayForBubble);   

	BubbleSort bubbleSort = new BubbleSort();
	bubbleSort.sort(arrayForBubble);
	
	// look what we got sorting array with BubbleSort
        System.out.println("BubbleSort: ");
	for (int c: arrayForBubble){
	System.out.print(c + " ");
	}
        System.out.println();
        
        
        // init array with random digits from -50 to 50
        int [] arrayForSelection = new int [20];
        randomInit.initialize(arrayForSelection);
        
        // sort array with SelectionSort
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arrayForSelection);
        
        // look what we got sorting with SelectionSort 
        System.out.println("SelectionSort: ");
        for (int d : arrayForSelection)
            System.out.print( d + " ") ;
        System.out.println();
        
        //init array with random digits [50,50]
        int[] arrayForShell = new int [20];
        randomInit.initialize(arrayForShell);
        
        //sort array with ShellSort
        ShellSort shellSort = new ShellSort();
        shellSort.sort(arrayForShell);
        
        // look what we gor sorting array with ShellSort 
        System.out.println ("ShellSort: ");
        for (int e : arrayForShell)
            System.out.print (e + " ");
 
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * + 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * + 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * + 2. Найти сумму элементов массива.
	     *
	     * + 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * + 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * + 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * + 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
