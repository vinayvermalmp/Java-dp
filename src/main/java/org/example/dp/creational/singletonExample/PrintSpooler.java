package org.example.dp.creational.singletonExample;

import java.util.ArrayList;
import java.util.List;

public class PrintSpooler {
    private static PrintSpooler instance;
    private List<String> printQueue;

    private List<PrintSpoolerListener> listeners;

    private Thread printThread;

    private PrintSpooler(){
        printQueue = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    public static synchronized PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void printDocument(String documentName){
        printQueue.add(documentName);
    }

    public  void addListener(PrintSpoolerListener listener){
        listeners.add(listener);
    }

    public void startPrinting(){
        printThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!printQueue.isEmpty()){
                    String documentName = printQueue.remove(0);
                    System.out.println("Printing document: " + documentName);
                }
                for (PrintSpoolerListener listener: listeners ) {
                    listener.onPrintingFinished();
                }
            }
        });

    }

}

interface PrintSpoolerListener {
    public void onPrintingFinished();
}

/*
*
* Explanation:

The PrintSpooler class is implemented as a singleton by using the singleton pattern.

The getInstance method returns the single instance of the PrintSpooler class. If the instance doesn't exist, it creates a new instance. The method is synchronized to make sure that only one thread can access it at a time.

The printDocument method adds a document to the printQueue list.

The addListener method adds a listener to the listeners list.

The startPrinting method starts the printing process in a separate thread. The printing process continues until the printQueue is empty. After the printing process is finished, it sends a notification to all registered listeners.
* */
