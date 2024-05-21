(format t "~%~%Exercicios")

(format t "~%~%1-)~%")

(defun calcule (operacao x y)
  (cond
    ((string= operacao "+") (format t "~% O resultado eh: ~D" (+ x y)))
    ((string= operacao "-") (format t "~% O resultado eh: ~D" (- x y)))
    ((string= operacao "*") (format t "~% O resultado eh: ~D" (* x y)))
    ((string= operacao "/")
     (if (zerop y)
         (format t "Erro: Divisao por zero nao permitida")
         (format t "~% O resultado eh: ~D" (/ x y))))
    (t (format t "Operacao invalida"))))
    (calcule "/" 10 2)
    
    (format t "~%~%2-)~%")
    
(defun maior (a b c)
  (cond
    ((and (>= a b) (>= a c)) a)
    ((and (>= b a) (>= b c)) b)
    (t c)))
    (format t "~% O maior elemento eh: ~D" (maior 5 48 21))
    
    (format t "~%~%3-)~%")
    
(defun multiplica (a b)
  (if (= b 0)
      0
      (+ a (multiplica a (- b 1)))))  
      (format t "~% O resultado eh: ~D" (multiplica 5 4))

    (format t "~%~%4-)~%")
    
(defun impares (lista)
  (dolist (elemento lista)
    (when (/= (mod elemento 2) 0)
      (format t "~d " elemento))))
      (impares '(1 2 3 4 5 6 7 8))
      
      
    (format t "~%~%5-)~%")
    
    (defun soma (lista1 lista2)
  (cond
    ((null lista1) '())
    ((null lista2) '())
    (t (cons (+ (car lista1) (car lista2))
             (soma (cdr lista1) (cdr lista2))))))
    (format t "~% O resultado da soma eh: ~D" (soma '(1 2 3 4 5) '(14 2 63 4 51)))
    