����   = R  	wierdalgo  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lwierdalgo; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextLine ()Ljava/lang/String;
   " ! java/lang/Integer # $ parseInt (Ljava/lang/String;)I	  & ' ( out Ljava/io/PrintStream; * java/lang/StringBuilder
 , . - java/lang/String / 0 valueOf (J)Ljava/lang/String;
 ) 2  3 (Ljava/lang/String;)V 5  
 ) 7 8 9 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 ) ; <  toString
 > @ ? java/io/PrintStream A 3 print              
 > G A H (J)V args [Ljava/lang/String; s Ljava/util/Scanner; number J StackMapTable 
SourceFile wierdalgo.java !               /     *� �    
                    	       �     Y� Y� � L+� � �A� 7� %� )Y � +� 14� 6� :� =  Bq
��   Di
aA� 	  BmA 
���ɲ % � F�    
   .          	 0 
 :  B  E  K  Q  X          Y I J    N K L   E M N  O    �  -  P    Q