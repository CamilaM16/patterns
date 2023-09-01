module Singleton where

data SingletonInstance = SingletonInstance { value :: Int } deriving Show

singletonInstance :: SingletonInstance
singletonInstance = SingletonInstance { value = 12 }

getValue :: Int 
getValue = value singletonInstance