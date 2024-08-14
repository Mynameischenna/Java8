//package collections;
//
//import java.io.IOException;
//import java.nio.file.*;
//import java.nio.file.attribute.BasicFileAttributes;
//import java.util.Queue;
//import java.util.concurrent.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.hrlc.compliance.service.xmlService;
//
//@RestController
//public class dumm1 {
//
//	 @Autowired
//	 private xmlService yourService;
//    private static final String SOURCE_FOLDER = "C:\\file processor\\new_files";
//    private static final String DESTINATION_FOLDER = "C:\\file processor\\done";
//    private static final String FAILED_FOLDER = "C:\\file processor\\failed";
//
//    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//    private final ExecutorService executor = Executors.newSingleThreadExecutor();
//
//
//
//    private Queue<Path> filesQueue = new LinkedBlockingQueue<>();
//
////    @PostMapping("/start")
////    public ResponseEntity<String> startFileProcessing() {
////        try {
////            // Schedule task to search for new files every 20 seconds
////            scheduler.scheduleAtFixedRate(this::enqueueFiles, 0, 20, TimeUnit.SECONDS);
////            return ResponseEntity.ok("File processing started.");
////        } catch (Exception e) {
////            e.printStackTrace();
////            return ResponseEntity.status(500).body("Error occurred while starting file processing.");
////        }
////    }
//
//    private void enqueueFiles() {
//        try {
//            // Add new files to the queue
//            Files.walkFileTree(Paths.get(SOURCE_FOLDER), new SimpleFileVisitor<Path>() {
//                @Override
//                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                    if (!filesQueue.contains(file)) {
//                        filesQueue.offer(file);
//                        System.out.println("New file detected and added to queue: " + file.getFileName());
//                    }
//                    return FileVisitResult.CONTINUE;
//                }
//            });
//            // Start processing files from the queue
//            executor.execute(this::processNextFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void processNextFile() {
//        try {
//            if (!filesQueue.isEmpty()) {
//                Path file = filesQueue.poll();
//                // Process the file
//                System.out.println("Processing file: " + file.getFileName());
//                String fileContent = new String(Files.readAllBytes(file));//converting to whole file as single text file
//                // Call the method with file content as string parameter
//                ResponseEntity<String> response = yourService.processXmlData(fileContent);
//                // Move the file based on the response
//                if (response.getStatusCode() == HttpStatus.OK) {
//                    // If successful, move the file to the destination folder
//                    Path destinationFile = Paths.get(DESTINATION_FOLDER).resolve(file.getFileName());
//                    Files.move(file, destinationFile, StandardCopyOption.REPLACE_EXISTING);
//                    System.out.println("File processed and moved: " + file.getFileName());
//                } else {
//                    // If failed, move the file to the failed folder
//                    Path failedFile = Paths.get(FAILED_FOLDER).resolve(file.getFileName());
//                    Files.move(file, failedFile, StandardCopyOption.REPLACE_EXISTING);
//                    System.out.println("File processing failed: " + file.getFileName());
//                }
//            } else {
//                System.out.println("No more files to process.");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
