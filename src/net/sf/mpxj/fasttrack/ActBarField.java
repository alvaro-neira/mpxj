
package net.sf.mpxj.fasttrack;

enum ActBarField
{
   START_DATE(1),
   START_TIME(2),
   FINISH_DATE(3),
   FINISH_TIME(4),
   DURATION(5),
   REVISED_START_DATE(6),
   REVISED_START_TIME(7),
   REVISED_FINISH_DATE(8),
   REVISED_FINISH_TIME(9),
   REVISED_DURATION(10),
   ACTUAL_START_DATE(11),
   ACTUAL_START_TIME(12),
   ACTUAL_FINISH_DATE(13),
   ACTUAL_FINISH_TIME(14),
   ACTUAL_DURATION(15),
   PERCENT_COMPLETE(16),
   BAR_ID(17),
   PRIORITY(18),
   RESOURCES_ASSIGNEDX(21),
   TOTAL_RESOURCE_DURATION(22),
   RESOURCE_COST(23),
   _YOFFSET(24),
   _BARBITS(25),
   _BARSTL(26),
   _ACTIVITY(27),
   BAR_ROW_ID(28),
   EARLY_START_DATE(29),
   EARLY_START_TIME(30),
   EARLY_FINISH_DATE(31),
   EARLY_FINISH_TIME(32),
   LATE_START_DATE(33),
   LATE_START_TIME(34),
   LATE_FINISH_DATE(35),
   LATE_FINISH_TIME(36),
   CONSTRAINT_TYPE(37),
   CONSTRAINT_DATE(38),
   CONSTRAINT_TIME(39),
   FINISH_FLOAT(40),
   START_FLOAT(41),
   FREE_FLOAT(42),
   TOTAL_FLOAT(43),
   CRITICAL(44),
   TOTAL_COST(45),
   FIXED_COST(46),
   WORK(47),
   CREATED(48),
   PREDECESSORS(49),
   SUCCESSORS(50),
   _ACTBAR_GUID(51),
   _ACTBAR_FILE_GUID(52),
   _ACTBAR_TIMESTAMP(53),
   _ACTBAR_VERSION(54),
   ATTENDEES(55),
   LOCATION(56),
   _PREDECESSORS_TABLE(57),
   _SUCCESSORS_TABLE(58),
   EFFORT_DRIVEN(60),
   FIXED_DURATION(61),
   PERCENT_USED(62),
   STATUS(63),
   IGNORE_RESOURCE_CALENDARS(64),
   NUMBER_1(250),
   NUMBER_2(251),
   NUMBER_3(252),
   NUMBER_4(253),
   NUMBER_5(254),
   NUMBER_6(255),
   NUMBER_7(256),
   NUMBER_8(257),
   NUMBER_9(258),
   NUMBER_10(259),
   NUMBER_11(260),
   NUMBER_12(261),
   NUMBER_13(262),
   NUMBER_14(263),
   NUMBER_15(264),
   NUMBER_16(265),
   NUMBER_17(266),
   NUMBER_18(267),
   NUMBER_19(268),
   NUMBER_20(269),
   NUMBER_21(270),
   NUMBER_22(271),
   NUMBER_23(272),
   NUMBER_24(273),
   NUMBER_25(274),
   NUMBER_26(275),
   NUMBER_27(276),
   NUMBER_28(277),
   NUMBER_29(278),
   NUMBER_30(279),
   NUMBER_31(280),
   NUMBER_32(281),
   NUMBER_33(282),
   NUMBER_34(283),
   NUMBER_35(284),
   NUMBER_36(285),
   NUMBER_37(286),
   NUMBER_38(287),
   NUMBER_39(288),
   NUMBER_40(289),
   NUMBER_41(290),
   NUMBER_42(291),
   NUMBER_43(292),
   NUMBER_44(293),
   NUMBER_45(294),
   NUMBER_46(295),
   NUMBER_47(296),
   NUMBER_48(297),
   NUMBER_49(298),
   NUMBER_50(299),
   COST_1(830),
   COST_2(831),
   COST_3(832),
   COST_4(833),
   COST_5(834),
   COST_6(835),
   COST_7(836),
   COST_8(837),
   COST_9(838),
   COST_10(839),
   DURATION_1(890),
   DURATION_2(891),
   DURATION_3(892),
   DURATION_4(893),
   DURATION_5(894),
   DURATION_6(895),
   DURATION_7(896),
   DURATION_8(897),
   DURATION_9(898),
   DURATION_10(899),
   DATE_1(950),
   DATE_2(951),
   DATE_3(952),
   DATE_4(953),
   DATE_5(954),
   DATE_6(955),
   DATE_7(956),
   DATE_8(957),
   DATE_9(958),
   DATE_10(959),
   TIME_1(1010),
   TIME_2(1011),
   TIME_3(1012),
   TIME_4(1013),
   TIME_5(1014),
   TIME_6(1015),
   TIME_7(1016),
   TIME_8(1017),
   TIME_9(1018),
   TIME_10(1019),
   FINISH_DATE_1(1070),
   FINISH_DATE_2(1071),
   FINISH_DATE_3(1072),
   FINISH_DATE_4(1073),
   FINISH_DATE_5(1074),
   FINISH_DATE_6(1075),
   FINISH_DATE_7(1076),
   FINISH_DATE_8(1077),
   FINISH_DATE_9(1078),
   FINISH_DATE_10(1079),
   FINISH_TIME_1(1130),
   FINISH_TIME_2(1131),
   FINISH_TIME_3(1132),
   FINISH_TIME_4(1133),
   FINISH_TIME_5(1134),
   FINISH_TIME_6(1135),
   FINISH_TIME_7(1136),
   FINISH_TIME_8(1137),
   FINISH_TIME_9(1138),
   FINISH_TIME_10(1139),
   START_DATE_1(1190),
   START_DATE_2(1191),
   START_DATE_3(1192),
   START_DATE_4(1193),
   START_DATE_5(1194),
   START_DATE_6(1195),
   START_DATE_7(1196),
   START_DATE_8(1197),
   START_DATE_9(1198),
   START_DATE_10(1199),
   START_TIME_1(1250),
   START_TIME_2(1251),
   START_TIME_3(1252),
   START_TIME_4(1253),
   START_TIME_5(1254),
   START_TIME_6(1255),
   START_TIME_7(1256),
   START_TIME_8(1257),
   START_TIME_9(1258),
   START_TIME_10(1259),
   BASELINE_START_DATE_1(1310),
   BASELINE_START_DATE_2(1311),
   BASELINE_START_DATE_3(1312),
   BASELINE_START_DATE_4(1313),
   BASELINE_START_DATE_5(1314),
   BASELINE_START_DATE_6(1315),
   BASELINE_START_DATE_7(1316),
   BASELINE_START_DATE_8(1317),
   BASELINE_START_DATE_9(1318),
   BASELINE_START_DATE_10(1319),
   BASELINE_START_TIME_1(1370),
   BASELINE_START_TIME_2(1371),
   BASELINE_START_TIME_3(1372),
   BASELINE_START_TIME_4(1373),
   BASELINE_START_TIME_5(1374),
   BASELINE_START_TIME_6(1375),
   BASELINE_START_TIME_7(1376),
   BASELINE_START_TIME_8(1377),
   BASELINE_START_TIME_9(1378),
   BASELINE_START_TIME_10(1379),
   BASELINE_FINISH_DATE_1(1430),
   BASELINE_FINISH_DATE_2(1431),
   BASELINE_FINISH_DATE_3(1432),
   BASELINE_FINISH_DATE_4(1433),
   BASELINE_FINISH_DATE_5(1434),
   BASELINE_FINISH_DATE_6(1435),
   BASELINE_FINISH_DATE_7(1436),
   BASELINE_FINISH_DATE_8(1437),
   BASELINE_FINISH_DATE_9(1438),
   BASELINE_FINISH_DATE_10(1439),
   BASELINE_FINISH_TIME_1(1490),
   BASELINE_FINISH_TIME_2(1491),
   BASELINE_FINISH_TIME_3(1492),
   BASELINE_FINISH_TIME_4(1493),
   BASELINE_FINISH_TIME_5(1494),
   BASELINE_FINISH_TIME_6(1495),
   BASELINE_FINISH_TIME_7(1496),
   BASELINE_FINISH_TIME_8(1497),
   BASELINE_FINISH_TIME_9(1498),
   BASELINE_FINISH_TIME_10(1499),
   BASELINE_DURATION_1(1550),
   BASELINE_DURATION_2(1551),
   BASELINE_DURATION_3(1552),
   BASELINE_DURATION_4(1553),
   BASELINE_DURATION_5(1554),
   BASELINE_DURATION_6(1555),
   BASELINE_DURATION_7(1556),
   BASELINE_DURATION_8(1557),
   BASELINE_DURATION_9(1558),
   BASELINE_DURATION_10(1559),
   BASELINE_COST_1(1610),
   BASELINE_COST_2(1611),
   BASELINE_COST_3(1612),
   BASELINE_COST_4(1613),
   BASELINE_COST_5(1614),
   BASELINE_COST_6(1615),
   BASELINE_COST_7(1616),
   BASELINE_COST_8(1617),
   BASELINE_COST_9(1618),
   BASELINE_COST_10(1619),
   BASELINE_WORK_1(1670),
   BASELINE_WORK_2(1671),
   BASELINE_WORK_3(1672),
   BASELINE_WORK_4(1673),
   BASELINE_WORK_5(1674),
   BASELINE_WORK_6(1675),
   BASELINE_WORK_7(1676),
   BASELINE_WORK_8(1677),
   BASELINE_WORK_9(1678),
   BASELINE_WORK_10(1679),
   CALCULATION_1(1730),
   CALCULATION_2(1731),
   CALCULATION_3(1732),
   CALCULATION_4(1733),
   CALCULATION_5(1734),
   CALCULATION_6(1735),
   CALCULATION_7(1736),
   CALCULATION_8(1737),
   CALCULATION_9(1738),
   CALCULATION_10(1739),
   CALCULATION_11(1740),
   CALCULATION_12(1741),
   CALCULATION_13(1742),
   CALCULATION_14(1743),
   CALCULATION_15(1744),
   CALCULATION_16(1745),
   CALCULATION_17(1746),
   CALCULATION_18(1747),
   CALCULATION_19(1748),
   CALCULATION_20(1749),
   CALCULATION_21(1750),
   CALCULATION_22(1751),
   CALCULATION_23(1752),
   CALCULATION_24(1753),
   CALCULATION_25(1754),
   CALCULATION_26(1755),
   CALCULATION_27(1756),
   CALCULATION_28(1757),
   CALCULATION_29(1758),
   CALCULATION_30(1759),
   CALCULATION_31(1760),
   CALCULATION_32(1761),
   CALCULATION_33(1762),
   CALCULATION_34(1763),
   CALCULATION_35(1764),
   CALCULATION_36(1765),
   CALCULATION_37(1766),
   CALCULATION_38(1767),
   CALCULATION_39(1768),
   CALCULATION_40(1769),
   CALCULATION_41(1770),
   CALCULATION_42(1771),
   CALCULATION_43(1772),
   CALCULATION_44(1773),
   CALCULATION_45(1774),
   CALCULATION_46(1775),
   CALCULATION_47(1776),
   CALCULATION_48(1777),
   CALCULATION_49(1778),
   CALCULATION_50(1779),
   CALCULATION_51(1780),
   CALCULATION_52(1781),
   CALCULATION_53(1782),
   CALCULATION_54(1783),
   CALCULATION_55(1784),
   CALCULATION_56(1785),
   CALCULATION_57(1786),
   CALCULATION_58(1787),
   CALCULATION_59(1788),
   CALCULATION_60(1789),
   CALCULATION_61(1790),
   CALCULATION_62(1791),
   CALCULATION_63(1792),
   CALCULATION_64(1793),
   CALCULATION_65(1794),
   CALCULATION_66(1795),
   CALCULATION_67(1796),
   CALCULATION_68(1797),
   CALCULATION_69(1798),
   CALCULATION_70(1799),
   CALCULATION_71(1800),
   CALCULATION_72(1801),
   CALCULATION_73(1802),
   CALCULATION_74(1803),
   CALCULATION_75(1804),
   CALCULATION_76(1805),
   CALCULATION_77(1806),
   CALCULATION_78(1807),
   CALCULATION_79(1808),
   CALCULATION_80(1809),
   CALCULATION_81(1810),
   CALCULATION_82(1811),
   CALCULATION_83(1812),
   CALCULATION_84(1813),
   CALCULATION_85(1814),
   CALCULATION_86(1815),
   CALCULATION_87(1816),
   CALCULATION_88(1817),
   CALCULATION_89(1818),
   CALCULATION_90(1819),
   CALCULATION_91(1820),
   CALCULATION_92(1821),
   CALCULATION_93(1822),
   CALCULATION_94(1823),
   CALCULATION_95(1824),
   CALCULATION_96(1825),
   CALCULATION_97(1826),
   CALCULATION_98(1827),
   CALCULATION_99(1828),
   CALCULATION_100(1829);

   private ActBarField(int value)
   {
      m_value = value;
   }

   private final int m_value;
}
