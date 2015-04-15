#lang racket

(require racket/vector)

(define (quicksort vec)
  (cond [(<= (vector-length vec) 1) vec]
        [else (quicksort-help vec)]))

(define (quicksort-help vec)
  (define pivot (vector-ref vec 0))
  (set! vec (vector-drop vec 1))
  (define left (vector-filter (curry >= pivot) vec))
  (define right (vector-filter-not (curry >= pivot) vec))
  (vector-append (vector-append (quicksort left) `#(,pivot)) (quicksort right)))
  
(define (demo)
  (define vec (for/vector ([_ (random 30)]) (random 50)))
  (printf "Before: ~a\n" vec)
  (printf "After: ~a\n" (quicksort vec)))

(demo)
