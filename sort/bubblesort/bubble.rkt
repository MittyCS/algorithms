#lang racket

(define (bubblesort vec)
  (define len (vector-length vec))
  (define at vector-ref)
  (let loop ((max len)
             (changed? #f))
    (for ([i (in-range 1 max)])
      (when (> (at vec (sub1 i)) (at vec i))
        (define tmp (at vec i))
        (vector-set! vec i (at vec (sub1 i)))
        (vector-set! vec (sub1 i) tmp)
        (set! changed? #t)))
    (when changed? (loop (sub1 max) #f)))
  vec)

(define (demo)
  (define vec (for/vector ([_ 10]) (random 20)))
  (printf "Before: ~a\n" vec)
  (printf "After: ~a\n" (bubblesort vec)))

(demo)
