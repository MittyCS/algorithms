#lang racket

(define (linear-search lst el)
  (let loop ((lst lst)
             (i 0))
    (cond ((empty? lst) #f)
          ((equal? (first lst) el) i)
          (else (loop (rest lst) (+ 1 i))))))

(define lst '(1 5 7 82 4))
(printf "Index of 82 in ~a: ~a\n" lst (linear-search lst 82))

(set! lst '(32 8 2 4 2))
(printf "Index of 5 in ~a: ~a\n" lst (linear-search lst 5))
